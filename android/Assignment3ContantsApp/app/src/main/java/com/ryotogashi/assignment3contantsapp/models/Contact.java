package com.ryotogashi.assignment3contantsapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contact {
    @SerializedName("gender")
    @Expose
    private String getnder;


    @SerializedName("name")
    @Expose
    private Name name;

    @SerializedName("location")
    @Expose
    private Location location;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("cell")
    @Expose
    private String cell;

    public String getGetnder() {
        return getnder;
    }

    public Name getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public String getCell() {
        return cell;
    }

    class Name{

        @SerializedName("first")
        @Expose
        private String first;

        @SerializedName("last")
        @Expose
        private String last;

        public String getFirst() {
            return first;
        }

        public String getLast() {
            return last;
        }

        @Override
        public String toString() {
            return first + ' ' + last;
        }
    }

    class Location{

        @SerializedName("street")
        @Expose
        private String street;

        @SerializedName("city")
        @Expose
        private String city;

        @SerializedName("state")
        @Expose
        private String province;

        @SerializedName("postcode")
        @Expose
        private String postcode;

        public String getStreet() {
            return street;
        }

        public String getCity() {
            return city;
        }

        public String getProvince() {
            return province;
        }

        public String getPostcode() {
            return postcode;
        }
    }
}