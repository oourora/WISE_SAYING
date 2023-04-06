package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class APP {
    private final Scanner sc;

    public APP(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");
        int count = 1;

        while (true) {
            String sentence = sc.nextLine().trim();
            ArrayList<Sayinglist> sayingLists = new ArrayList<>();

            if (sentence.equals("종료")) {
                break;

            } else if (sentence.equals("등록")) {
                System.out.println("명령) ");
                System.out.println("명언 : ");
                String saying = sc.nextLine().trim();
                System.out.println("작가 : ");
                String author = sc.nextLine().trim();

                Sayinglist sayinglist = new Sayinglist(count, saying, author);
                sayingLists.add(sayinglist);

                System.out.println(count + "번 명언이 등록되었습니다.");
                count++;
            } else if (sentence.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-".repeat(30));

                for (int i = sayingLists.size() - 1; i >= 0; i--) {
                    Sayinglist sayinglist = sayingLists.get(i);

                    System.out.printf("%d / %s / %s", sayinglist.getId(), sayinglist.getContent(), sayinglist.getAuthor());

                }//
                for (Sayinglist sayingList : sayingLists) {
                    Sayinglist sayinglist = sayingLists.get(i);
                        //
                    System.out.printf("%d / %s / %s", sayinglist.getId(), sayinglist.getContent(), sayinglist.getAuthor());

                }
            }
        }

    }
}
