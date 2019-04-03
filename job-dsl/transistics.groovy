pipelineJob('DSL_Pipeline') {

    def repo = 'https://github.com/Jouda-Hidri/Transistics.git'
   
    triggers {
        scm('*/15 * * * *')
    }
    
    definition {
        cpsScm {
          scm {
            git(repo, 'dev', { node -> node / 'extensions' << '' } )
            }
        }
    }
}