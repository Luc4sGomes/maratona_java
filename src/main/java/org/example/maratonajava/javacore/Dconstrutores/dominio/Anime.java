package org.example.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String name;
    private String type;
    private String genery;
    private String estudio;
    private int eps;

    public Anime() {
        System.out.println("dentro do construtor sem argumentos");
    }


    public Anime(String name, String type, String genery, int eps) {
        this();
        this.name = name;
        this.type = type;
        this.genery = genery;
        this.eps = eps;

    }

    public Anime(String name, String type, String genery, int eps, String estudio) {
        this(name, type, genery, eps);
        this.estudio = estudio;

    }

    public void init(String name) {
        this.name = name;
    }

    public void init(String name, String type, String genery, int eps) {
        this.init(name);
    }


    public void imprime() {
        System.out.println(this.type);
        System.out.println(this.eps);
        System.out.println(this.name);
        System.out.println(this.genery);
    }

    public String getGenery() {
        return genery;
    }

    public void setGenery(String genery) {
        this.genery = genery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;

    }

    public String getType() {
        return this.type;
    }

    public void setEps(int eps) {
        this.eps = eps;
    }

    public int getEps() {
        return this.eps;
    }


}
