public class Car {
    private int dvs;
    private String name;
    {                    // <  Проверка методов Геттеры-Сеттеры с реальными значениями с помощью блока инициализации
                         // Вывод-в Main.Java
        dvs = 10;
        name = "Some car";
    }

    public int getDvs() {   //Геттер
        return dvs;
    }

    public void setDvs(int dvs) {  //Сеттер
        if (dvs>0){
            this.dvs = dvs;
        }
    }

    public String getName() {   //Геттер
        return name;
    }

    public void setName(String name) {   //Сеттер
        if (!name.equals("")){
            this.name = name;
        }
    }

    public void Info() {
        System.out.println("Машина " + name + ", имеет " + dvs + "лс");
    }

}
