package com.nsv.jsmbaba.list.doublelinkedlist;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class EmployeeNode {

    @NonNull
    private Employee employee;

    private EmployeeNode next;

    private EmployeeNode previous;

    @Override
    public String toString() {
        return "EmployeeNode{" +
                "employee=" + employee +
                '}';
    }
}
