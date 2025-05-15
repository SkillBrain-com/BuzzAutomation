package homework.AndreiB.marti18_02;

import marti11_02.BankAccount;

import java.util.List;

public class Iteratii {

    public static void main(String[] args) {

        BankAccount count1 = new BankAccount(" Andrei Burhala", 4500);
        BankAccount count2 = new BankAccount("Popescu Andreea", 500);
        BankAccount count3 = new BankAccount("georgiana vasile", 500);
        BankAccount count4 = new BankAccount("ion ion", 5003);
        BankAccount count5 = new BankAccount("ion raul", 5003);

        List<BankAccount>numeCont = new java.util.ArrayList<>(List.of(count1, count2, count3, count4));

        for(int i = 0; i < numeCont.size(); i++) {
            System.out.println(numeCont.get(i).getNumarCont() + " " + numeCont.get(i).getBalanta());
        }
        numeCont.set(3, count5);
        for(int i = 0; i < numeCont.size(); i++) {
            System.out.println(numeCont.get(i).getNumarCont() + " " + numeCont.get(i).getBalanta());
        }
        }


    }

