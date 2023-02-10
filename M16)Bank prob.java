abstract class Bank {
  abstract double getRateOfInterest();
}

class SBI extends Bank {
  double getRateOfInterest() {
    return 8.4;
  }
}

class ICICI extends Bank {
  double getRateOfInterest() {
    return 7.3;
  }
}

class AXIS extends Bank {
  double getRateOfInterest() {
    return 9.7;
  }
}

public class BankExample {
  public static void main(String[] args) {
    Bank bank = new SBI();
    System.out.println("Rate of Interest: " + bank.getRateOfInterest() + "%");
  }
}
