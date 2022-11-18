import java.util.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        NoteBook nb = new NoteBook();
        nb.setName("Lenovo IdeaPad 3 15IGL05");
        nb.setColor("Black");
        nb.setOs("Windows 10");
        nb.setOzu(4);
        nb.setSsd(true);
        nb.setYears(2021);
        nb.setSize(256);
        nb.setType("Classic");
        nb.price = 1170.0;

        NoteBook nb1 = new NoteBook();
        nb1.setName("HP Victus 16-e0060ur");
        nb1.setColor("Black");
        nb1.setOs("Windows 10");
        nb1.setOzu(16);
        nb1.setSsd(true);
        nb1.setYears(2021);
        nb1.setSize(512);
        nb1.setType("Gaming");
        nb1.price = 2790.0;

        NoteBook nb2 = new NoteBook();
        nb2.setName("HP 240 G8");
        nb2.setColor("Black");
        nb2.setOs("Windows 10");
        nb2.setOzu(8);
        nb2.setSsd(false);
        nb2.setYears(2021);
        nb2.setSize(256);
        nb2.setType("Classic");
        nb2.price = 2958.0;

        NoteBook nb3 = new NoteBook();
        nb3.setName("Apple Macbook Pro 14");
        nb3.setColor("Gray");
        nb3.setOs("Mac OS (Monterey)");
        nb3.setOzu(16);
        nb3.setSsd(true);
        nb3.setYears(2021);
        nb3.setSize(512);
        nb3.setType("Ultrabook");
        nb3.price = 6200.0;

        NoteBook nb4 = new NoteBook();
        nb4.setName("Lenovo IdeaPad 5 Pro 14ACN6");
        nb4.setColor("Gray");
        nb4.setOs("Windows 10");
        nb4.setOzu(16);
        nb4.setSsd(true);
        nb4.setYears(2021);
        nb4.setSize(512);
        nb4.setType("Classic");
        nb4.price = 3060.0;

        NoteBook nb5 = new NoteBook();
        nb5.setName("MSI Stealth GS77");
        nb5.setColor("Gray");
        nb5.setOs("Windows 10");
        nb5.setOzu(64);
        nb5.setSsd(true);
        nb5.setYears(2022);
        nb5.setSize(2048);
        nb5.setType("Gaming");
        nb5.price = 16681.84;

        Set<NoteBook> noteBooks = new HashSet<>();
        noteBooks.add(nb);
        noteBooks.add(nb1);
        noteBooks.add(nb2);
        noteBooks.add(nb3);
        noteBooks.add(nb4);
        noteBooks.add(nb5);

        Map<Integer, String> filter = filter();
        NoteBook searchBooks = new NoteBook();
        if (filter.get(1) != null) {
            searchBooks.setColor(filter.get(1));
        }
        if (filter.get(2) != null) {
            searchBooks.setOs(filter.get(2));
        }
        if (filter.get(3) != null) {
            searchBooks.setOzu(Integer.parseInt(filter.get(3)));
        }
        if (filter.get(4) != null) {
            searchBooks.setSize(Integer.parseInt(filter.get(4)));
        }
        if (filter.get(5) != null) {
            searchBooks.setType(filter.get(5));
        }
        for (NoteBook i: noteBooks) {
            if (i.equals(searchBooks)) {
                if (filter.get(6) != null && filter.get(7) != null) {
                    if (filter.get(7).equals("min")){
                        if (i.price <= Integer.parseInt(filter.get(6))){
                            Logger.getAnonymousLogger().info(i.toString());
                        }
                    } else if (filter.get(7).equals("max")) {
                        if (i.price >= Integer.parseInt(filter.get(6))){
                            Logger.getAnonymousLogger().info(i.toString());
                        }
                    }
                }
                else{
                    Logger.getAnonymousLogger().info(i.toString());
                }
            }
        }
    }

    private static Map<Integer, String> filter(){
        Map<Integer, String> fil = new HashMap();
        fil.put(1, null);
        fil.put(2, null);
        fil.put(3, null);
        fil.put(4, null);
        fil.put(5, null);
        fil.put(6, null);
        fil.put(7, null);

        while (true){
            System.out.println("Введите критерии поиска:" +
                    "\n1 - Color" +
                    "\n2 - OS" +
                    "\n3 - ОЗУ" +
                    "\n4 - Объем памяти" +
                    "\n5 - Type" +
                    "\n6 - Prise" +
                    "\n7 - Prise(min/max)" +
                    "\n8 - Exit");
            int key = Integer.parseInt(new Scanner(System.in).nextLine());
            if (key > 7){
                break;
            }
            String meaning = new Scanner(System.in).nextLine();
            fil.put(key, meaning);
        }
        return fil;
    }
}