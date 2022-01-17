import axios from "axios";

const PROVIDED_SERVICES_API_BASE_URL = "http://localhost:8080/services";

class  ProvidedServices{

    getServices(){
        return axios.get(PROVIDED_SERVICES_API_BASE_URL);
    }

}

export default new ProvidedServices()