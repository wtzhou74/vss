package gov.samhsa.c2s.domain;

import gov.samhsa.c2s.domain.valueobject.CodeName;
import gov.samhsa.c2s.domain.valueobject.RevisionRecord;
import lombok.Data;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Audited
@Data
public class ValueSet {
    @Id
    @GeneratedValue
    private Long id;

    private String description;

    @ManyToOne
    private ValueSetCategory valueSetCategory;

    @Embedded
    private CodeName codeName;

    @Embedded
    private RevisionRecord revisionRecord;
}