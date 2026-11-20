package org.example;

public class Rating {

    private String alias;
    private String email;
    private int grade;

    public Rating(String alias, String email, int grade) {

        if (grade < 1 || grade > 10) {
            throw new IllegalArgumentException("Grade must be between 1 and 10");
        }

        this.alias = alias;
        this.email = email;
        this.grade = grade;
    }

    public String getAlias() {
        return alias;
    }

    public String getEmail() {
        return email;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Rating [alias=" + alias + ", email=" + email + ", grade=" + grade + "]";
    }
}