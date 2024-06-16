package org.vikhyat.model.match;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.vikhyat.model.people.Commentator;

@Getter
@Setter
@AllArgsConstructor
public class Commentory {
    private Commentator commentator;
    private String commentry;
}
