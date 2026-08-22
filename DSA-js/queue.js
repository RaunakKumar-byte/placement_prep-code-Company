class Queue{
    constructor(){
        this.items=[];
    }

    enqueue(element){
        this.items.push(element);
    }

    dequeue(){
        if(this.isEmpty()){
            return "Queue is empty";
        }

        return this.items.shift();
    }

    peek(){
        if(this.isEmpty()){
            return "Queue is empty";
        }
        return this.items[0];
    }

    isEmpty(){
        return this.items.length===0;
    }

    size(){
        return this.items.length;
    }
}

const queue = new Queue();
queue.enqueue(10);
queue.enqueue(25);
queue.enqueue(42);
console.log(queue.peek());    
console.log(queue.dequeue()); 
console.log(queue.peek());