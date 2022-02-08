package com.nsv.jsmbaba.hashtable;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class StoredEmployee {

    private Employee employee;

    private String key;

    public StoredEmployee(Employee employee) {
        this.employee = employee;
    }

    public StoredEmployee(String key, Employee employee) {
        this.employee = employee;
        this.key = key;
    }
}
