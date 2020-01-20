// https://kotlinlang.org/docs/tutorials/coroutines/async-programming.html

fun postItem(item: Item) {
    val token = preparePost()
    val post = submitPost(token, item)
    processPost(post)
}

fun preparePost(): Token {
    // makes a request and consequently blocks the main thread
    return token
}

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