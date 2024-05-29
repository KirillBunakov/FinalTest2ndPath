package Finaltest.Animals;

public class PackAnimal extends BaseAnimal {

  public PackAnimal(String name, int countOfLegs, boolean hasTool) {
    super(name, countOfLegs, hasTool);
    // TODO Auto-generated constructor stub
  }

  @Override
  public String Voice(String phrase) {
    // TODO Auto-generated method stub
    return super.Voice(phrase);
  }

  @Override
  public int getCountOfLegs() {
    // TODO Auto-generated method stub
    return super.getCountOfLegs();
  }

  @Override
  public boolean getHasTool() {
    // TODO Auto-generated method stub
    return super.getHasTool();
  }

  @Override
  public String getName() {
    // TODO Auto-generated method stub
    return super.getName();
  }

  @Override
  public String run() {
    // TODO Auto-generated method stub
    return super.run();
  }

  @Override
  public void setCountOfLegs(int countOfLegs) {
    // TODO Auto-generated method stub
    super.setCountOfLegs(countOfLegs);
  }

  @Override
  public void setHasTool(boolean hasTool) {
    // TODO Auto-generated method stub
    super.setHasTool(hasTool);
  }

  @Override
  public void setName(String name) {
    // TODO Auto-generated method stub
    super.setName(name);
  }

  public String carry(String str) {
    System.out.println("I am carrying " + str);
    return str;
  }

  @Override
  public void iCanDo() {
    // TODO Auto-generated method stub
    super.iCanDo();
    System.out.println(" - Везти груз carry()");
  }

  @Override
  public String getTypeOfAnimal() {
    return "Вьючное животное";
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
