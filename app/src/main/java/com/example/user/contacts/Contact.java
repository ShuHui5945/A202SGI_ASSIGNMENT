package com.example.user.contacts;

import android.net.Uri;


public class Contact {
    private String _name, _phone, _email, _address;
    private Uri _imageURI;
    private int _id;

    public Contact (int id,String name, String phone, String email, String address, Uri image){
        _id = id;
        _name = name;
        _phone = phone;
        _email = email;
        _address = address;
        _imageURI = image;
    }

    public int getId(){
        return _id;
    }

    public String getName(){
        return _name;
    }

    public String getPhone(){
        return _phone;
    }

    public String getEmail(){
        return _email;
    }

    public String getAddress(){
        return _address;
    }

    public Uri getImage(){
        return _imageURI;
    }
}
