public class Singer extends Person{
    private String nameSinger;
    private String designatoinSinger;

    public Singer(String name, String surName,String nameSinger,String designatoinSinger) {
        super(name, surName);
        this.nameSinger = nameSinger;
        this.designatoinSinger = designatoinSinger;

    }

    @Override
    public String toString() {
        return "Singer{" +
                "nameSinger='" + nameSinger + '\'' +
                ", designatoinSinger='" + designatoinSinger + '\'' +
                "} " + super.toString();
    }
}
