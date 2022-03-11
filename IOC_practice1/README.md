# Activité pratique 1 
# Inversion of Control & Injection of Dependencies

## Table of Contents
1. [Introduction](#Introduction)
2. [Enoncé](#Enoncé)
3. [Conception](#Conception)
4. [Réalisation](#Réalisation)
5. [Conclusion](#Conclusion)

## Introduction


## Enoncé

## Conception
![image](https://user-images.githubusercontent.com/73220257/157950084-ed4b2b92-0c4a-4e85-aae3-d9b4f5a1b144.png)


## Réalisation
#### Les interfaces

##### IDAO
```
package dao;

public interface IDao {
    public double getData();
}
```
 ##### IMetier
 
 ```
 package metier;

public interface IMetier {
    public double calcul();
}

```

#### Les implémentations 
##### DAO
```
package dao;
import org.springframework.stereotype.Component;

;

@Component
public class DaoImpl implements IDao{


    public double getData() {
        /* Version 1 Traitement DB */

        return 23;
    }
}
```
##### Metier
```
package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{
@Autowired
    private IDao dao;

    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*225;
        return res;
    }
/*Injecter dans la variable Dao un objet
* d'une classe qui implémente IDao */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
```

#### Instanciation 
##### Statique

```
MetierImpl metier = new MetierImpl();
DaoImpl dao = new DaoImpl();
metier.setDao(dao);
System.out.println(metier.calcul());
```

##### Dynamique
```

        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao)cDao.newInstance();

        String metierClassName=scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier =(IMetier)cMetier.newInstance();

        Method method=cMetier.getMethod("setDao", IDao.class);
        method.invoke(metier,dao);
```



###### injection avec XML
```

       ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
       IMetier metier = (IMetier) context.getBean("metier");
       System.out.println(metier.calcul());
```
![image](https://user-images.githubusercontent.com/73220257/157924980-33e05149-39b4-4dc8-9da5-e7aad90a2bd0.png)

###### injection avec annotations 
```
   /*
        Version annotations
         */
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcul());
        
```
![image](https://user-images.githubusercontent.com/73220257/157925060-25c6e925-1a84-42ca-a7be-8557ca6b7e44.png)




## Conclusion 
