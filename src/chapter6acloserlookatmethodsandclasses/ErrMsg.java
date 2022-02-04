package chapter6acloserlookatmethodsandclasses;

// Return a String object.
class ErrorMsg {
  String msgs[] = {"Output Error", "Input Error", "Disk Full", "Index Out-Of-Bounds"};

  // Return the error message.
  String getErrorMsg(int i) {
    if (i >= 0 & i < msgs.length) // Return an object of type String
    return msgs[i];
    else return "invalid Error Code";
  }
}

public class ErrMsg {
  public static void main(String[] args) {
    ErrorMsg err = new ErrorMsg();
    System.out.println(err.getErrorMsg(2));
    System.out.println(err.getErrorMsg(19));
  }
}
