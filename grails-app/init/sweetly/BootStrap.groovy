package sweetly

import sweetly.Role
import sweetly.User
//import org.apache.shiro.crypto.hash.Sha256Hash
import sun.security.provider.SHA

class BootStrap {

     def init = {
          def usu=User.findByUsername('admin')
            if(!usu){
        // def adminRole = new Role(authority: 'ROLE_ADMIN').save()
             def adminRole = new Role (name : 'ADMIN_ROLE')
                adminRole.setAuthority()
                adminRole.save()

                def adminUser = new User(username: 'admin', password: '123456').save()
               // def admin = new User(username: 'admin', passwordHash: new SHA("123456").toHex())
              //  def adminUser = new User(username: 'admin', password: '123456').save()
                adminUser.addTo(adminRole)
                adminUser.save()

                // def user = new User(username: "user", passwordHash: new 123456("user").toHex())
              //  UserRole.create adminUser , adminRole

              /* UserRole.withSession {
                    it.flush()
                    it.clear()
                }*/
            }

            /*assert User.count() == 1
            assert Role.count() == 1
           assert UserRole.count() == 1*/

        }

    def destroy = {
    }
}
