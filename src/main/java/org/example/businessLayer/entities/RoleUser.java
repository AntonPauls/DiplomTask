package org.example.businessLayer.entities;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;


public enum RoleUser {
    @Enumerated(EnumType.ORDINAL)
    ADMIN, SCIENTIST, SIMPLE_USER
}
