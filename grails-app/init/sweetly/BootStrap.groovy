package sweetly

import sweetly.Role
import sweetly.User
//import org.apache.shiro.crypto.hash.Sha256Hash
import sun.security.provider.SHA

class BootStrap {

    def init = { servletContext ->
        new ProductAnnouncement(message: 'Launch day').save()
        new ProductAnnouncement(message: 'We keep adding features').save()




    def springSecurityService


        new ProductAnnouncement(message: 'Launch day').save()

        def userRole = new Role('ROLE_USER').save()

        def me = new User('admin', '123456').save()

        UserRole.create me, userRole

        UserRole.withSession {
            it.flush()
            it.clear()
        }

    }

    def destroy = {
    }

}
