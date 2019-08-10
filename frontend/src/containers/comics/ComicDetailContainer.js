import React, {Component} from 'react';
import ComicDetails from '../../components/comics/ComicDetails';

class ComicDetailContainer extends Component {

  constructor(props){
    super(props);
  }

  render(){
    return(
      <div className="comic-detail-container">
        <ComicDetails comics={this.props.comics}/>
      </div>
    )
  }


}

export default ComicDetailContainer;
