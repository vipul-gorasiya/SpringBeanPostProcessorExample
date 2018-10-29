# Spring Custom Bean Post processor example

## How is it configured in example

1. CustomBeanPostProcessor implements BeanPostProcessor interface and provides custom logic for processing. Inorder to register this processor, it has be scanned by Spring Container which can be achieved by adding @Component.
2. Spring smartly picks it up as BeanPostProcessor and executes it for all bean processing.

## Importing and running project

1. Import project as Maven project
2. Run application as Spring Boot Application
3. Observe log to see the sequence of execution
