job('Test-4-job') {
  description('This is an example job.')
  scm {
    git('https://github.com/example/example-repo.git')
  }
  steps {
    shell('echo "Hello from Job DSL!"')
  }
  triggers {
    scm('* * * * *')
  }
}
