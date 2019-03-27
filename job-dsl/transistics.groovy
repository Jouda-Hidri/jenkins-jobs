job('PROJ-unit-tests') {
    scm {
        git {
            remote {
                github('Jouda-Hidri/Transistics', 'ssh')
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