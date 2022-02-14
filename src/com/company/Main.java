package com.company;

public class Main {

    /*Animal деген класс тузунуз жана бир метод кошунуз.
Анын 3 наследнигин тузунуз.

Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин
кошунуз.
instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
чыгарыныз.
Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды
болуп оз озунун массивине салыныз*/

    public static void main(String[] args) {

        Animal[] animal = {new Shark(),
                new Turtle(),
                new Eagle()};
        Animal[] animals = {animal[0],animal[1],animal[2]};

        for (Animal mal : animals) {
            if (mal.getClass().getName().equals("com.company.Shark")) {
                ((Shark) mal).attack();
            }

            if (mal instanceof Turtle) {
                ((Turtle)mal).swim();
            }

            if (mal.getClass().getName().equals("com.company.Eagle")) {
                assert mal instanceof Eagle;
                ((Eagle)mal).fly();
            }


        }


    }
}
