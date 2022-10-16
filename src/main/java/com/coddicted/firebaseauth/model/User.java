package com.coddicted.firebaseauth.model;

import com.google.cloud.firestore.annotation.DocumentId;
import lombok.Data;

@Data
public class User {
    @DocumentId
    private String id;
    private String name;
}
