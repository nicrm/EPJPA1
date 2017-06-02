package com.mycompany.jpa1.entities;

import com.mycompany.jpa1.entities.ProjectUser;
import com.mycompany.jpa1.entities.Task;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-19T10:04:33")
@StaticMetamodel(Project.class)
public class Project_ { 

    public static volatile SingularAttribute<Project, String> created;
    public static volatile SingularAttribute<Project, Integer> id;
    public static volatile ListAttribute<Project, ProjectUser> projectUsers;
    public static volatile SingularAttribute<Project, String> userName;
    public static volatile ListAttribute<Project, Task> tasks;
    public static volatile SingularAttribute<Project, String> email;

}