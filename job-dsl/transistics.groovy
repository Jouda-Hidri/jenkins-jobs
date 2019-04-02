job('PROJ-unit-tests') {
    scm {
        git('git://github.com/Jouda-Hidri/Transistics.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('DSL User')
            node / gitConfigEmail('hidrijouda@gmail.com')
        }
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        shell("echo 'Hello World'")
    }
}