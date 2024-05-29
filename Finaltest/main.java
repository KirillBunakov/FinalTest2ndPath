package Finaltest;

import java.io.FileWriter;
import java.io.IOException;

import Finaltest.Animals.BaseAnimal;
import Finaltest.Animals.HomePet;
import Finaltest.Animals.PackAnimal;
import Finaltest.Animals.AnimalBox;
import java.util.ArrayList;

public class main {
  public static void main(String[] args) {
    HomePet cat = new HomePet("Kitty ", 4, true);
    HomePet dog = new HomePet("Ben ", 4, true);
    PackAnimal horse = new PackAnimal("Buran", 4, true);
    PackAnimal donkey = new PackAnimal("donkey", 4, true);

    ArrayList animalsArray = new ArrayList<BaseAnimal>();
    animalsArray.add(cat);
    animalsArray.add(dog);
    animalsArray.add(horse);
    animalsArray.add(donkey);
    AnimalBox animalsBox = new AnimalBox(animalsArray);
    System.out.println(cat.Voice("wow"));
    System.out.println(animalsArray.get(1));

    horse.getCountOfLegs();
    horse.carry("сено");
    cat.iCanDo();
    horse.iCanDo();

    System.out.println(cat.getId());
    System.out.println(animalsBox.getElem(0).Voice("meow"));
    System.out.println(animalsBox.getSize());

    try (FileWriter fw = new FileWriter("список животных.txt")) {
      fw.write("Животные, которых мы завели: \n");
      for (int i = 0; i <= animalsBox.getSize() - 1; i++) {
        fw.write("- " + animalsBox.getElem(i));
        fw.write("\n");
      }
      fw.write("Всего животных: " + animalsBox.getSize());
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
