package cinema.dao.impl;

import cinema.dao.AbstractDao;
import cinema.dao.RoleDao;
import cinema.exception.DataProcessingException;
import cinema.model.Role;
import java.util.Optional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getByName(Role.RoleName roleName) {
        try (Session session = factory.openSession()) {
            return Optional.ofNullable(session.createQuery("FROM Role "
                            + "WHERE Role.roleName = :roleName", Role.class)
                    .setParameter("roleName", roleName)
                    .getSingleResult());
        } catch (Exception e) {
            throw new DataProcessingException("Can't get role by name : " + roleName, e);
        }
    }
}
