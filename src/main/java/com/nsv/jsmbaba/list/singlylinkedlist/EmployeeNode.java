package com.nsv.jsmbaba.list.singlylinkedlist;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class EmployeeNode {

    @NonNull
    private Employee employee;

    private EmployeeNode next;

}
