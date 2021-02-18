package item03;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class Main {

  public static void main(String[] args) {
    SingletonField singletonField1 = SingletonField.INSTANCE;
    SingletonField singletonField2 = SingletonField.INSTANCE;
    System.out.println(
        "(singletonField1 == singletonField2) = " + (singletonField1 == singletonField2));

    SingletonFactory singletonFactory1 = SingletonFactory.getInstance();
    SingletonFactory singletonFactory2 = SingletonFactory.getInstance();
    System.out.println(
        "(singletonFactory1 == singletonFactory2) = " + (singletonFactory1 == singletonFactory2));

    SingletonEnum singletonEnum1 = SingletonEnum.INSTANCE;
    SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
    System.out.println(
        "(singletonEnum1 == singletonEnum2) = " + (singletonEnum1 == singletonEnum2));

    // 직렬화 싱글턴 확인: 정적 팩터리
    String serializedSingletonField = serializeObject(singletonField1);
    SingletonField singletonField3 = (SingletonField) deserializeObject(serializedSingletonField);
    System.out.println(
        "(singletonField1 == singletonField3) = " + (singletonField1 == singletonField3));

    // 직렬화 싱글턴 확인: public static final 필드
    String serializedSingletonFactory = serializeObject(singletonFactory1);
    SingletonFactory singletonFactory3 =
        (SingletonFactory) deserializeObject(serializedSingletonFactory);
    System.out.println(
        "(singletonFactory1 == singletonFactory3) = " + (singletonFactory1 == singletonFactory3));

    // 직렬화 싱글턴 확인: 열거 타입 - readResolve() 가 필요 없다
    String serializedSingletonEnum = serializeObject(singletonEnum1);
    SingletonEnum singletonEnum3 = (SingletonEnum) deserializeObject(serializedSingletonEnum);
    System.out.println(
        "(singletonEnum1 == singletonEnum3) = " + (singletonEnum1 == singletonEnum3));
  }

  private static String serializeObject(Object object) {
    try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
      try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
        oos.writeObject(object);
        return Base64.getEncoder().encodeToString(baos.toByteArray());
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  private static Object deserializeObject(String serializedObject) {
    byte[] decodedObject = Base64.getDecoder().decode(serializedObject);
    try (ByteArrayInputStream bais = new ByteArrayInputStream(decodedObject)) {
      try (ObjectInputStream ois = new ObjectInputStream(bais)) {
        return ois.readObject();
      } catch (ClassNotFoundException e) {
        e.printStackTrace();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }
}
