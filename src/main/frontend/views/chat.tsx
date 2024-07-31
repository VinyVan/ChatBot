import {Button, TextField} from "@vaadin/react-components";
import {useState} from "react";
import {ChatAiService} from "Frontend/generated/endpoints";
import Markdown from "react-markdown";


export default function Chat (){


    async  function send(){
        ChatAiService.chatBot(question).then(result=>setResponse(result))
    }
    const [question,setQuestion] = useState<string>("")
    const [response,setResponse] = useState<string>("")
    return (
        <div className="p-m">
            <h1>Chat Bot</h1>
            <div>
                <TextField  style={{width:'80%'}} onChange={(e=>setQuestion(e.target.value))} />
                <Button theme="primary" onClick={send}  >Send</Button>
            </div>
            <Markdown>
                {response}
            </Markdown>

        </div>
    );
}