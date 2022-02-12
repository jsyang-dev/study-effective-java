package item13;

public final class PhoneNumberChild extends PhoneNumberParent {

    public PhoneNumberChild(int areaCode, int prefix, int lineNum) {
        super(areaCode, prefix, lineNum);
    }

    @Override
    protected PhoneNumberChild clone() {
        return (PhoneNumberChild) super.clone();
    }
}
