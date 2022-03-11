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
