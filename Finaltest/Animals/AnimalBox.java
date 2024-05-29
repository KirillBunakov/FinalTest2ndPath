package Finaltest.Animals;

import java.util.ArrayList;

public class AnimalBox {
  public ArrayList<BaseAnimal> list;

  public AnimalBox(ArrayList<BaseAnimal> list) {
    this.list = list;
  }

  public ArrayList<BaseAnimal> getList() {
    return list;
  }

  public void setList(ArrayList<BaseAnimal> list) {
    this.list = list;
  }

  public int getSize() {
    return list.size();
  }

  public BaseAnimal getElem(int x) {
    return list.get(x);
  }

  public String getName(int x) {
    return list.get(x).getName();
  }

  public String getTypeOfAnimal(int x) {
    return list.get(x).getTypeOfAnimal();
  }
}
// public String getNameFromSucces(int x) {
// String q = "";
// for (Toys elem : list) {
// if (elem.getSuccesNumber() == x) {
// q = elem.getName();
// elem.decreaseQuantity();
// }
// }