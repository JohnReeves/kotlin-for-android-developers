// kotlinc hello.kt -include-runtime -d hello.jar


fun postItem(item: Item) {
    preparePostAsync() 
        .thenCompose { token -> 
            submitPostAsync(token, item)
        }
        .thenAccept { post -> 
            processPost(post)
        }
         
}

fun preparePostAsync(): Promise<Token> {
    // makes request an returns a promise that is completed later
    return promise 
}