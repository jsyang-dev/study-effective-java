package item13;

public class Main {

    public static void main(String[] args) {
        // clone 메서드 재정의
        final PhoneNumber phoneNumber = new PhoneNumber(31, 1234, 5678);
        final PhoneNumber clonedPhoneNumber = phoneNumber.clone();

        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("phoneNumber1 = " + clonedPhoneNumber);
        System.out.println("phoneNumber.equals(clonedPhoneNumber) = " + phoneNumber.equals(clonedPhoneNumber));

        // clone 메서드가 생성자를 호출하는 경우
        final PhoneNumberChild phoneNumberChild = new PhoneNumberChild(31, 1234, 5678);
        try {
            final PhoneNumberChild clonedPhoneNumberChild = phoneNumberChild.clone();   // ClassCastException 예외가 발생한다.
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }
}
