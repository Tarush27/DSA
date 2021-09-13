package com.company.useOfStaticKeyword;
// use of static keyword
public class College {
    static String name = "Chandigarh University";
    String address;  // instance data member (not static)
    int helpLineNo;  // instance data member (not static)

    College(String address, int helpLineNo){
        this.address = address;
        this.helpLineNo = helpLineNo;
    }
    void show(){
        System.out.println(name + " " + address + " " + helpLineNo);
    }

    static void change(){
        name = "CU";
    }

    // use of static block.
    static{
        System.out.println("jksguifajcybiwrh8vr");
    }
    public static void main(String ...args){
        System.out.println(College.name);
        College.change();
        System.out.println(College.name);
    }
}
