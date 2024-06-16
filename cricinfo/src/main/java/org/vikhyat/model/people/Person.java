package org.vikhyat.model.people;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.vikhyat.common.Contact;
import org.vikhyat.common.PersonalInfo;

@Getter
@Setter
@ToString
public class Person {
    private String name;
    private Contact contact;
    private PersonalInfo personalInfo;
    public Person(String name){
        this.name =name;

    }

}
