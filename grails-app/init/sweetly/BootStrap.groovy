package sweetly

class BootStrap {


        def init = {

            def usu=User.findByUsername('admin')
            if(!usu){
                def adminRole = new Role(authority: 'ROLE_ADMIN').save()

                def adminUser = new User(username: 'admin', password: '123456').save()

                UserRole.create adminUser , adminRole

                UserRole.withSession {
                    it.flush()
                    it.clear()
                }
            }

            /*assert User.count() == 1
            assert Role.count() == 1
            assert UserRole.count() == 1*/

        }

    def destroy = {
    }
}
