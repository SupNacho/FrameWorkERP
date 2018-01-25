package model.user;

import java.util.Random;

public class Client extends Person{
    private final int id;
    private int discount;



    public static class Builder{
        private final String name;
        private final String phone;

        private String email = "";
        private String address = "";
        private int discount = 0;

        public Builder(String name, String phone){
            this.name = name;
            this.phone = phone;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setAddress(String address){
            this.address = address;
            return this;
        }

        public Builder setDiscount(int discount){
            this.discount = discount;
            return this;
        }

        public Client build(){
            return new Client(this);
        }

    }

    private Client(Builder builder) {
        setName(builder.name);
        setPhone(builder.phone);
        setAddress(builder.address);
        setEmail(builder.email);
        setDiscount(builder.discount);
        this.id = generateId();
    }

    public int getId() {
        return id;
    }


    public int getDiscount() {
        return discount;
    }


    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public int generateId() {
        return new Random().nextInt(500000) + 500000;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name=" + getName() + "discount=" + discount +
                '}';
    }
}
