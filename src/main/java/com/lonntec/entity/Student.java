package com.lonntec.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test_student")
public class Student {
        @Id
        @Column(name = "id")
        private String id;

        @Column(name = "name")
        private String name;

        @Column(name = "title")
        private String six;

        @Column(name = "author")
        private String age;

        @Column(name = "description")
        private String memo;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSix() {
            return six;
        }

        public void setSix(String six) {
            this.six = six;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getMemo() {
            return memo;
        }

        public void setMemo(String memo) {
            this.memo = memo;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", six='" + six + '\'' +
                    ", age='" + age + '\'' +
                    ", memo='" + memo + '\'' +
                    '}';
        }
}
