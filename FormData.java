package com.briellebait.identificationapplication;

public class FormData {

    private String name;
    private String age;
    private String title;
    private String hometown;

    public FormData() {
        this.name = name;
        this.age = age;
        this.title = title;
        this.hometown = hometown;
    }

    //getters
    public String getName()
    {
        return name;
    }
    public String getAge()
    {
        return age;
    }
    public String getTitle()
    {
        return title;
    }
    public String getHometown()
    {
        return hometown;
    }


    //setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAge(String age)
    {
        this.age = age;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setHometown(String hometown)
    {
        this.hometown = hometown;
    }




}
