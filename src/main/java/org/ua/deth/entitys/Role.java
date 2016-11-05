package org.ua.deth.entitys;

import javax.persistence.*;

@Entity
public class Role {
    @Id
    @SequenceGenerator(name = "role_seq", sequenceName = "role_seq")
    @GeneratedValue(generator = "role_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "role_id")
    private long roleId;

    @Column(name = "role", length = 15)
    private String role;

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
