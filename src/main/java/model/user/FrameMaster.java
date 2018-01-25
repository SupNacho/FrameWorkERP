package model.user;

import java.util.Random;

public class FrameMaster extends Person {
    private final int id;

    public static class Builder {
        private final String name;
        private final String phone;

        private String email = "";
        private String address = "";

        public Builder(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public FrameMaster build() {
            return new FrameMaster(this);
        }

    }

    private FrameMaster(Builder builder) {
        setName(builder.name);
        setPhone(builder.phone);
        setAddress(builder.address);
        setEmail(builder.email);
        this.id = generateId();
    }

    public int getId() {
        return id;
    }

    @Override
    public int generateId() {
        return new Random().nextInt(500000) + 1000000;
    }

    @Override
    public String toString() {
        return "FrameMaster{" +
                "id=" + id +
                " name=" + getName() + " address=" + getAddress() + " phone=" + getPhone() + '}';
    }
}
