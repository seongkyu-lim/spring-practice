package com.alan.springexercisebook.bothJavaAndKotlin.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.NoArgsConstructor
import lombok.RequiredArgsConstructor

@Entity
@NoArgsConstructor
public class Member (
    var login: String,
    var firstname: String,
    var lastname: String,
    var description: String? = null,
    @Id @GeneratedValue var id: Long? = null){



}