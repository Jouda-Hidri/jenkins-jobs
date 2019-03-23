job('PROJ-unit-tests') {
    scm {
        git {
            remote {
                github('git://github.com/Jouda-Hidri/Transistics', 'ssh')
                credentials('github-ci-key')
            }
        }
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        maven('-e clean test')
    }
}