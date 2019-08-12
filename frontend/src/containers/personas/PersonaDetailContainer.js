import React, {Component} from 'react';
import PersonaDetails from '../../components/personas/PersonaDetails';
import ReviewForm from '../../components/reviews/ReviewForm';

class PersonaDetailContainer extends Component {

  constructor(props){
    super(props);
  }



  render(){
    
    return(
      <div className="character-detail-container">
        <PersonaDetails persona={this.props.persona} />
      </div>
    )
  }


}

export default PersonaDetailContainer;
