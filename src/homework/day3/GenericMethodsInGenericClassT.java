package homework.day3;

public class GenericMethodsInGenericClassT<T> {
    public <X> void genericMethodOneGenArg(X argument) {
        String className = argument.getClass().getSimpleName();
        System.out.println("I am an object of " + className + " class");
    }

    public <X, Y> String genericMethodTwoGenArgs(X firstArgument, Y secondArgument) {
        String firstClassName = firstArgument.getClass().getSimpleName();
        String secondClassName = secondArgument.getClass().getSimpleName();
        return "We are objects of " + firstClassName + " class and " + secondClassName + " class";
    }

    public <X> void genericMethodHalfGenArgs(X generalArgument, String stringArgument) {
        String className = generalArgument.getClass().getSimpleName();
        int stringLength = stringArgument.length();
        System.out.println("I got an object of " + className + " class and string with " + stringLength + " characters");
    }
}
