import React, {useState, useEffect} from "react";
import axios from "axios"
import "./ChatBot.css"

const ChatBot = () => {
    const [chats, setChats] = useState([])
    const [query, setQuery] = useState("")
    const [messages, setMessage] = useState([])

    useEffect(() =>{
        axios
        .get("http://localhost:5000/api/chats")
        .then((res) => setChats(res.data))
        .catch((err) => console.error(err));
        }, [])

        const handleChat = () => {
            if(!query.trim()) return

            setMessage((prev) => [...prev, {role: "user", text: query}])

            const found = chats.find(
                (chat) => chat.question.toLowerCase() === query.toLowerCase()
            )

            setMessage((prev) =>[
                ...prev,
                {
                    role: "boot",
                    text: found ? found.answer: "No se encontro una respuesta adecuada"
                }
            ])
            setQuery("")
        }
        const handleKeyPress = (e) => {
            if(e.key === "Enter"){
                handleChat()
            }
        }

        return(
            <div className ="chat-container">
            <div className = "chat-massages">
                {messages.map((msg, idx) =>(
                    <div
                    key={idx}
                    className= {`message.bubble ${
                    msg.role === "user" ? "user-bobule" : "bot-bubble"
                    }`}
                    >
                        {msg.text}
                    </div>

                ))}

            </div>

            <div className ="chat-input">
                <input
                type = "text"
                placeholder="Escribe tu pregunta: "
                value = {query}
                onChange={(e) => setQuery(e.target.value)}
                onKeyPress={handleKeyPress}
                />
                <button onClick={handleChat}>Enviar</button>

            </div>
            </div>
        )
    }
    
    export default ChatBot