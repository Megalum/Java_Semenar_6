public class NoteBook {
    private String name;
    private int years;
    private String color;
    private int ozu;
    private int size;
    private String os;
    private String type;
    private boolean ssd;
    double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOzu(int ozu) {
        this.ozu = ozu;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSsd(boolean ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "Цена: " + price +
                ". Название: " + name +
                ", Год выпуска: " + years +
                ", Цвет: " + color +
                ", ОЗУ: " + ozu +
                ", Объем памяти: " + size +
                ", Операционная система: " + os +
                ", Тип: " + type +
                ", ССД: " + ssd +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        NoteBook noteBook = (NoteBook) obj;
        boolean flag = true;
        if (noteBook.color != null){
            flag = color == noteBook.color;
        }
        if (noteBook.ozu != 0 && flag){
            flag = ozu == noteBook.ozu;
        }
        if (noteBook.size != 0 && flag){
            flag = size == noteBook.size;
        }
        if (noteBook.os != null && flag){
            flag = os == noteBook.os;
        }
        if (noteBook.type != null && flag){
            flag = type == noteBook.type;
        }
        return flag;
    }

    @Override
    public int hashCode() {
        return (ozu + size + years) * 27;
    }
}
